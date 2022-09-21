package typings.sharepoint.global

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Callout")
@js.native
open class Callout ()
  extends StObject
     with typings.sharepoint.Callout {
  
  /** Adds a link to the actions panel in the bottom part of the callout window */
  /* CompleteClass */
  override def addAction(action: typings.sharepoint.CalloutAction): Unit = js.native
  
  /** Adds event handler to the callout.
    @param eventName one of the following: "opened", "opening", "closing", "closed" */
  /* CompleteClass */
  override def addEventCallback(eventName: String, callback: js.Function1[/* callout */ this.type, Unit]): Unit = js.native
  
  /** Hide the callout. Animation can be used only for IE9+ */
  /* CompleteClass */
  override def close(useAnimation: Boolean): Unit = js.native
  
  /** Do not call this directly. Instead, use CalloutManager.remove */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /** Returns the callout actions menu */
  /* CompleteClass */
  override def getActionMenu(): typings.sharepoint.CalloutActionMenu = js.native
  
  /** Returns the beak orientation defined for the callout during its creation. */
  /* CompleteClass */
  override def getBeakOrientation(): String = js.native
  
  /** Returns the bounding element defined for the callout during its creation. */
  /* CompleteClass */
  override def getBoundingBox(): HTMLElement = js.native
  
  /** Returns the contents of the callout. */
  /* CompleteClass */
  override def getContent(): String = js.native
  
  /** Returns the content element of the callout. */
  /* CompleteClass */
  override def getContentElement(): HTMLElement = js.native
  
  /** Returns the content width defined for the callout during its creation. */
  /* CompleteClass */
  override def getContentWidth(): Double = js.native
  
  /** Returns the ID of the callout. */
  /* CompleteClass */
  override def getID(): String = js.native
  
  /** Returns the launch point element of the callout. */
  /* CompleteClass */
  override def getLaunchPoint(): HTMLElement = js.native
  
  /** Returns the object that represents open behaivor defined for the callout during its creation. */
  /* CompleteClass */
  override def getOpenOptions(): typings.sharepoint.CalloutOpenOptions = js.native
  
  /** Returns the position algorithm function defined for the callout during its creation. */
  /* CompleteClass */
  override def getPositionAlgorithm(): Any = js.native
  
  /** Returns the title of the callout. */
  /* CompleteClass */
  override def getTitle(): String = js.native
  
  /** Specifies wherever callout is in "Closed" state */
  /* CompleteClass */
  override def isClosed(): Boolean = js.native
  
  /** Specifies wherever callout is in "Closing" state */
  /* CompleteClass */
  override def isClosing(): Boolean = js.native
  
  /** Specifies wherever callout is in "Opened" state */
  /* CompleteClass */
  override def isOpen(): Boolean = js.native
  
  /** Specifies wherever callout is in "Opened" or "Opening" state */
  /* CompleteClass */
  override def isOpenOrOpening(): Boolean = js.native
  
  /** Specifies wherever callout is in "Opening" state */
  /* CompleteClass */
  override def isOpening(): Boolean = js.native
  
  /** Display the callout. Animation can be used only for IE9+ */
  /* CompleteClass */
  override def open(useAnimation: Boolean): Unit = js.native
  
  /** Re-renders the actions menu. Call after the actions menu is changed. */
  /* CompleteClass */
  override def refreshActions(): Unit = js.native
  
  /** Sets options for the callout. Not all options can be changed for the callout after its creation. */
  /* CompleteClass */
  override def set(options: typings.sharepoint.CalloutOptions): Any = js.native
  
  /** Display if hidden, hide if shown. */
  /* CompleteClass */
  override def toggle(): Unit = js.native
}
