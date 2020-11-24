package typings.sharepoint

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutOptions extends js.Object {
  
  /** Some unique id for the callout. */
  var ID: String = js.native
  
  /** One of the following: "topBottom" (default) or "leftRight". */
  var beakOrientation: String = js.native
  
  /** If defined, callout will be inscribed into the bounding element. */
  var boundingBox: HTMLElement = js.native
  
  /** String (HTML allowed) that represents contents of the callout window. */
  var content: String = js.native
  
  /** HTML element that represents contents of the callout window. */
  var contentElement: HTMLElement = js.native
  
  /** Content element's width in pixels. By default = 350. */
  var contentWidth: Double = js.native
  
  /** Element on that the callout is shown. */
  var launchPoint: HTMLElement = js.native
  
  /** Fires right after the callout is closed */
  def onClosedCallback(callout: Callout): Unit = js.native
  
  /** Fires right before the callout is closed */
  def onClosingCallback(callout: Callout): Unit = js.native
  
  /** Fires right after the callout is shown */
  def onOpenedCallback(callout: Callout): Unit = js.native
  
  /** Fires after the callout is rendered but before it is positioned and shown */
  def onOpeningCallback(callout: Callout): Unit = js.native
  
  /** Defines opening behavior */
  var openOptions: CalloutOpenOptions = js.native
  
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  def positionAlgorithm(callout: Callout): Unit = js.native
  
  /** Title for the callout */
  var title: String = js.native
}
object CalloutOptions {
  
  @scala.inline
  def apply(
    ID: String,
    beakOrientation: String,
    boundingBox: HTMLElement,
    content: String,
    contentElement: HTMLElement,
    contentWidth: Double,
    launchPoint: HTMLElement,
    onClosedCallback: Callout => Unit,
    onClosingCallback: Callout => Unit,
    onOpenedCallback: Callout => Unit,
    onOpeningCallback: Callout => Unit,
    openOptions: CalloutOpenOptions,
    positionAlgorithm: Callout => Unit,
    title: String
  ): CalloutOptions = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], beakOrientation = beakOrientation.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], launchPoint = launchPoint.asInstanceOf[js.Any], onClosedCallback = js.Any.fromFunction1(onClosedCallback), onClosingCallback = js.Any.fromFunction1(onClosingCallback), onOpenedCallback = js.Any.fromFunction1(onOpenedCallback), onOpeningCallback = js.Any.fromFunction1(onOpeningCallback), openOptions = openOptions.asInstanceOf[js.Any], positionAlgorithm = js.Any.fromFunction1(positionAlgorithm), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOptions]
  }
  
  @scala.inline
  implicit class CalloutOptionsOps[Self <: CalloutOptions] (val x: Self) extends AnyVal {
    
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
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeakOrientation(value: String): Self = this.set("beakOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBox(value: HTMLElement): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElement(value: HTMLElement): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidth(value: Double): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPoint(value: HTMLElement): Self = this.set("launchPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClosedCallback(value: Callout => Unit): Self = this.set("onClosedCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClosingCallback(value: Callout => Unit): Self = this.set("onClosingCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenedCallback(value: Callout => Unit): Self = this.set("onOpenedCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpeningCallback(value: Callout => Unit): Self = this.set("onOpeningCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenOptions(value: CalloutOpenOptions): Self = this.set("openOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionAlgorithm(value: Callout => Unit): Self = this.set("positionAlgorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
