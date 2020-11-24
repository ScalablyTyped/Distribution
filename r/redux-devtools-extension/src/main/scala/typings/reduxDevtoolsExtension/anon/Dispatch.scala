package typings.reduxDevtoolsExtension.anon

import typings.reduxDevtoolsExtension.reduxDevtoolsExtensionStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatch extends js.Object {
  
  /**
    * dispatch custom actions or action creators
    */
  var dispatch: js.UndefOr[Boolean] = js.native
  
  /**
    * export history of actions in a file
    */
  var export: js.UndefOr[Boolean | custom] = js.native
  
  /**
    * import history of actions from a file
    */
  var `import`: js.UndefOr[Boolean | custom] = js.native
  
  /**
    * jump back and forth (time travelling)
    */
  var jump: js.UndefOr[Boolean] = js.native
  
  /**
    * lock/unlock dispatching actions and side effects
    */
  var lock: js.UndefOr[Boolean] = js.native
  
  /**
    * start/pause recording of dispatched actions
    */
  var pause: js.UndefOr[Boolean] = js.native
  
  /**
    * persist states on page reloading
    */
  var persist: js.UndefOr[Boolean] = js.native
  
  /**
    * drag and drop actions in the history list
    */
  var reorder: js.UndefOr[Boolean] = js.native
  
  /**
    * skip (cancel) actions
    */
  var skip: js.UndefOr[Boolean] = js.native
  
  /**
    * generate tests for the selected actions
    */
  var test: js.UndefOr[Boolean] = js.native
}
object Dispatch {
  
  @scala.inline
  def apply(): Dispatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dispatch]
  }
  
  @scala.inline
  implicit class DispatchOps[Self <: Dispatch] (val x: Self) extends AnyVal {
    
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
    def setDispatch(value: Boolean): Self = this.set("dispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    
    @scala.inline
    def setExport(value: Boolean | custom): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    
    @scala.inline
    def setImport(value: Boolean | custom): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
    
    @scala.inline
    def setJump(value: Boolean): Self = this.set("jump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJump: Self = this.set("jump", js.undefined)
    
    @scala.inline
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setReorder(value: Boolean): Self = this.set("reorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorder: Self = this.set("reorder", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
