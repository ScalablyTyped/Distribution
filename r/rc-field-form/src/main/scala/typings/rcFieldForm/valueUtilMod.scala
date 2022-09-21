package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.EventArgs
import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.StoreValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-field-form/es/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneByNamePathList(store: Store, namePathList: js.Array[InternalNamePath]): Store = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneByNamePathList")(store.asInstanceOf[js.Any], namePathList.asInstanceOf[js.Any])).asInstanceOf[Store]
  
  inline def containsNamePath(namePathList: js.Array[InternalNamePath], namePath: InternalNamePath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsNamePath")(namePathList.asInstanceOf[js.Any], namePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaultGetValueFromEvent(
    valuePropName: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs is not an array type */ args: EventArgs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetValueFromEvent")(valuePropName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getNamePath(): InternalNamePath = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamePath")().asInstanceOf[InternalNamePath]
  inline def getNamePath(path: NamePath): InternalNamePath = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamePath")(path.asInstanceOf[js.Any]).asInstanceOf[InternalNamePath]
  
  inline def getValue(store: Store, namePath: InternalNamePath): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(store.asInstanceOf[js.Any], namePath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isSimilar(source: SimilarObject, target: SimilarObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSimilar")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchNamePath(namePath: InternalNamePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNamePath")(namePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchNamePath(namePath: InternalNamePath, changedNamePath: InternalNamePath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchNamePath")(namePath.asInstanceOf[js.Any], changedNamePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def move[T](array: js.Array[T], moveIndex: Double, toIndex: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], moveIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def setValue(store: Store, namePath: InternalNamePath, value: StoreValue): Store = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(store.asInstanceOf[js.Any], namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Store]
  inline def setValue(store: Store, namePath: InternalNamePath, value: StoreValue, removeIfUndefined: Boolean): Store = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(store.asInstanceOf[js.Any], namePath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], removeIfUndefined.asInstanceOf[js.Any])).asInstanceOf[Store]
  
  inline def setValues[T](store: T, restValues: T*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setValues")(List(store.asInstanceOf[js.Any]).`++`(restValues.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  
  type SimilarObject = String | Double | js.Object
}
