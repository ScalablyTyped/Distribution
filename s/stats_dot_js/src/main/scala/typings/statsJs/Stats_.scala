package typings.statsJs

import typings.statsJs.Stats.Panel
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats_ extends js.Object {
  
  var REVISION: Double = js.native
  
  def addPanel(panel: Panel): Panel = js.native
  
  def begin(): Unit = js.native
  
  var dom: HTMLDivElement = js.native
  
  def end(): Double = js.native
  
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: Double): Unit = js.native
  
  def update(): Unit = js.native
}
object Stats_ {
  
  @scala.inline
  def apply(
    REVISION: Double,
    addPanel: Panel => Panel,
    begin: () => Unit,
    dom: HTMLDivElement,
    end: () => Double,
    showPanel: Double => Unit,
    update: () => Unit
  ): Stats_ = {
    val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = js.Any.fromFunction0(begin), dom = dom.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), showPanel = js.Any.fromFunction1(showPanel), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Stats_]
  }
  
  @scala.inline
  implicit class Stats_Ops[Self <: Stats_] (val x: Self) extends AnyVal {
    
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
    def setREVISION(value: Double): Self = this.set("REVISION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPanel(value: Panel => Panel): Self = this.set("addPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBegin(value: () => Unit): Self = this.set("begin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDom(value: HTMLDivElement): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPanel(value: Double => Unit): Self = this.set("showPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
