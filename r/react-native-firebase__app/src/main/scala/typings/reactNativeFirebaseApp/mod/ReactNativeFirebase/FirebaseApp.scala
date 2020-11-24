package typings.reactNativeFirebaseApp.mod.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseApp extends js.Object {
  
  /**
    * Make this app unusable and free up resources.
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * The name (identifier) for this App. '[DEFAULT]' is the default App.
    */
  val name: String = js.native
  
  /**
    * The (read-only) configuration options from the app initialization.
    */
  val options: FirebaseAppOptions = js.native
  
  def utils(): typings.reactNativeFirebaseApp.mod.Utils_.Module = js.native
}
object FirebaseApp {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    name: String,
    options: FirebaseAppOptions,
    utils: () => typings.reactNativeFirebaseApp.mod.Utils_.Module
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], utils = js.Any.fromFunction0(utils))
    __obj.asInstanceOf[FirebaseApp]
  }
  
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FirebaseAppOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: () => typings.reactNativeFirebaseApp.mod.Utils_.Module): Self = this.set("utils", js.Any.fromFunction0(value))
  }
}
