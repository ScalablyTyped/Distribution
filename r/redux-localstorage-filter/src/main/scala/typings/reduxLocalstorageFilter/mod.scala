package typings.reduxLocalstorageFilter

import typings.reduxLocalstorage.mod.StorageAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-localstorage-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]]]
  @scala.inline
  def default(paths: String): js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(paths.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]]]
  @scala.inline
  def default(paths: js.Array[String]): js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(paths.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[js.Any], StorageAdapter[js.Any]]]
  
  @scala.inline
  def getSubset(obj: js.Any, paths: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubset")(obj.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
