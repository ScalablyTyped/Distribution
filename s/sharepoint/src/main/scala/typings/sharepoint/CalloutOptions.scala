package typings.sharepoint

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutOptions extends StObject {
  
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
  implicit class CalloutOptionsMutableBuilder[Self <: CalloutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeakOrientation(value: String): Self = StObject.set(x, "beakOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBox(value: HTMLElement): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPoint(value: HTMLElement): Self = StObject.set(x, "launchPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClosedCallback(value: Callout => Unit): Self = StObject.set(x, "onClosedCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClosingCallback(value: Callout => Unit): Self = StObject.set(x, "onClosingCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenedCallback(value: Callout => Unit): Self = StObject.set(x, "onOpenedCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpeningCallback(value: Callout => Unit): Self = StObject.set(x, "onOpeningCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenOptions(value: CalloutOpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionAlgorithm(value: Callout => Unit): Self = StObject.set(x, "positionAlgorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
