package typings.reduxFirstRouterRestoreScroll.anon

import typings.reduxFirstRouter.mod.LocationState
import typings.reduxFirstRouterRestoreScroll.reduxFirstRouterRestoreScrollStrings.`profile-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manual extends js.Object {
  
  /** @default false */
  var manual: js.UndefOr[Boolean] = js.native
  
  /** Use to implement custom scroll positioning. */
  var shouldUpdateScroll: js.UndefOr[
    js.Function2[
      /* prev */ LocationState[js.Object, _], 
      /* locationState */ LocationState[js.Object, _], 
      Boolean | `profile-box` | (js.Tuple2[Double, Double])
    ]
  ] = js.native
  
  /**
    * To implement a custom backend storage for scroll state, pass a custom
    * stateStorage object. The object should implement the methods as described
    * by the package `scroll-behavior` as well as a function called setPrevKey
    * that keeps track of the previous key.
    */
  var stateStorage: js.UndefOr[Read] = js.native
}
object Manual {
  
  @scala.inline
  def apply(): Manual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manual]
  }
  
  @scala.inline
  implicit class ManualOps[Self <: Manual] (val x: Self) extends AnyVal {
    
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
    def setManual(value: Boolean): Self = this.set("manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    
    @scala.inline
    def setShouldUpdateScroll(
      value: (/* prev */ LocationState[js.Object, _], /* locationState */ LocationState[js.Object, _]) => Boolean | `profile-box` | (js.Tuple2[Double, Double])
    ): Self = this.set("shouldUpdateScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldUpdateScroll: Self = this.set("shouldUpdateScroll", js.undefined)
    
    @scala.inline
    def setStateStorage(value: Read): Self = this.set("stateStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateStorage: Self = this.set("stateStorage", js.undefined)
  }
}
