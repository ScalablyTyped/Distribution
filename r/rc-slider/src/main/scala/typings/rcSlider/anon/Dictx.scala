package typings.rcSlider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictx
  extends /* x */ StringDictionary[js.Any] {
  def addDocumentMouseEvents(): Unit = js.native
  def addDocumentTouchEvents(): Unit = js.native
  def blur(): Unit = js.native
  def calcOffset(value: js.Any): Double = js.native
  def calcValue(offset: js.Any): js.Any = js.native
  def calcValueByPos(position: js.Any): js.Any = js.native
  def componentDidMount(): Unit = js.native
  def componentWillUnmount(): Unit = js.native
  def focus(): Unit = js.native
  def getSliderLength(): js.Any = js.native
  def getSliderStart(): js.Any = js.native
  def onBlur(e: js.Any): Unit = js.native
  def onClickMarkLabel(e: js.Any, value: js.Any): Unit = js.native
  def onFocus(e: js.Any): Unit = js.native
  def onKeyDown(e: js.Any): Unit = js.native
  def onMouseDown(e: js.Any): Unit = js.native
  def onMouseMove(e: js.Any): Unit = js.native
  def onMouseUp(): Unit = js.native
  def onTouchMove(e: js.Any): Unit = js.native
  def onTouchStart(e: js.Any): Unit = js.native
  def removeDocumentEvents(): Unit = js.native
  def render(): Element = js.native
  def saveHandle(index: js.Any, handle: js.Any): Unit = js.native
  def saveSlider(slider: js.Any): Unit = js.native
}

object Dictx {
  @scala.inline
  def apply(
    addDocumentMouseEvents: () => Unit,
    addDocumentTouchEvents: () => Unit,
    blur: () => Unit,
    calcOffset: js.Any => Double,
    calcValue: js.Any => js.Any,
    calcValueByPos: js.Any => js.Any,
    componentDidMount: () => Unit,
    componentWillUnmount: () => Unit,
    focus: () => Unit,
    getSliderLength: () => js.Any,
    getSliderStart: () => js.Any,
    onBlur: js.Any => Unit,
    onClickMarkLabel: (js.Any, js.Any) => Unit,
    onFocus: js.Any => Unit,
    onKeyDown: js.Any => Unit,
    onMouseDown: js.Any => Unit,
    onMouseMove: js.Any => Unit,
    onMouseUp: () => Unit,
    onTouchMove: js.Any => Unit,
    onTouchStart: js.Any => Unit,
    removeDocumentEvents: () => Unit,
    render: () => Element,
    saveHandle: (js.Any, js.Any) => Unit,
    saveSlider: js.Any => Unit
  ): Dictx = {
    val __obj = js.Dynamic.literal(addDocumentMouseEvents = js.Any.fromFunction0(addDocumentMouseEvents), addDocumentTouchEvents = js.Any.fromFunction0(addDocumentTouchEvents), blur = js.Any.fromFunction0(blur), calcOffset = js.Any.fromFunction1(calcOffset), calcValue = js.Any.fromFunction1(calcValue), calcValueByPos = js.Any.fromFunction1(calcValueByPos), componentDidMount = js.Any.fromFunction0(componentDidMount), componentWillUnmount = js.Any.fromFunction0(componentWillUnmount), focus = js.Any.fromFunction0(focus), getSliderLength = js.Any.fromFunction0(getSliderLength), getSliderStart = js.Any.fromFunction0(getSliderStart), onBlur = js.Any.fromFunction1(onBlur), onClickMarkLabel = js.Any.fromFunction2(onClickMarkLabel), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart), removeDocumentEvents = js.Any.fromFunction0(removeDocumentEvents), render = js.Any.fromFunction0(render), saveHandle = js.Any.fromFunction2(saveHandle), saveSlider = js.Any.fromFunction1(saveSlider))
    __obj.asInstanceOf[Dictx]
  }
  @scala.inline
  implicit class DictxOps[Self <: Dictx] (val x: Self) extends AnyVal {
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
    def setAddDocumentMouseEvents(value: () => Unit): Self = this.set("addDocumentMouseEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setAddDocumentTouchEvents(value: () => Unit): Self = this.set("addDocumentTouchEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def setCalcOffset(value: js.Any => Double): Self = this.set("calcOffset", js.Any.fromFunction1(value))
    @scala.inline
    def setCalcValue(value: js.Any => js.Any): Self = this.set("calcValue", js.Any.fromFunction1(value))
    @scala.inline
    def setCalcValueByPos(value: js.Any => js.Any): Self = this.set("calcValueByPos", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentDidMount(value: () => Unit): Self = this.set("componentDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def setComponentWillUnmount(value: () => Unit): Self = this.set("componentWillUnmount", js.Any.fromFunction0(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSliderLength(value: () => js.Any): Self = this.set("getSliderLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSliderStart(value: () => js.Any): Self = this.set("getSliderStart", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBlur(value: js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClickMarkLabel(value: (js.Any, js.Any) => Unit): Self = this.set("onClickMarkLabel", js.Any.fromFunction2(value))
    @scala.inline
    def setOnFocus(value: js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyDown(value: js.Any => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseDown(value: js.Any => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseMove(value: js.Any => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseUp(value: () => Unit): Self = this.set("onMouseUp", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTouchMove(value: js.Any => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTouchStart(value: js.Any => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveDocumentEvents(value: () => Unit): Self = this.set("removeDocumentEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setRender(value: () => Element): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def setSaveHandle(value: (js.Any, js.Any) => Unit): Self = this.set("saveHandle", js.Any.fromFunction2(value))
    @scala.inline
    def setSaveSlider(value: js.Any => Unit): Self = this.set("saveSlider", js.Any.fromFunction1(value))
  }
  
}

