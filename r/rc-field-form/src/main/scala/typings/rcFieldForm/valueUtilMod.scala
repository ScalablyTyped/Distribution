package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.EventArgs
import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.StoreValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-field-form/es/utils/valueUtil", JSImport.Namespace)
@js.native
object valueUtilMod extends js.Object {
  
  def cloneByNamePathList(store: Store, namePathList: js.Array[InternalNamePath]): Store = js.native
  
  def containsNamePath(namePathList: js.Array[InternalNamePath], namePath: InternalNamePath): Boolean = js.native
  
  def defaultGetValueFromEvent(
    valuePropName: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs is not an array type */ args: EventArgs
  ): js.Any = js.native
  
  def getNamePath(): InternalNamePath = js.native
  def getNamePath(path: NamePath): InternalNamePath = js.native
  
  def getValue(store: Store, namePath: InternalNamePath): js.Any = js.native
  
  def isSimilar(source: SimilarObject, target: SimilarObject): Boolean = js.native
  
  def matchNamePath(namePath: InternalNamePath): Boolean = js.native
  def matchNamePath(namePath: InternalNamePath, changedNamePath: InternalNamePath): Boolean = js.native
  
  def move[T](array: js.Array[T], moveIndex: Double, toIndex: Double): js.Array[T] = js.native
  
  def setValue(store: Store, namePath: InternalNamePath, value: StoreValue): Store = js.native
  
  def setValues[T](store: T, restValues: T*): T = js.native
  
  type SimilarObject = String | Double | js.Object
}
