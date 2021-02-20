package typings.sharepoint

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callout extends StObject {
  
  /** Adds a link to the actions panel in the bottom part of the callout window */
  def addAction(action: CalloutAction): Unit = js.native
  
  /** Adds event handler to the callout.
    @param eventName one of the following: "opened", "opening", "closing", "closed" */
  def addEventCallback(eventName: String, callback: js.Function1[/* callout */ this.type, Unit]): Unit = js.native
  
  /** Hide the callout. Animation can be used only for IE9+ */
  def close(useAnimation: Boolean): Unit = js.native
  
  /** Do not call this directly. Instead, use CalloutManager.remove */
  def destroy(): Unit = js.native
  
  /** Returns the callout actions menu */
  def getActionMenu(): CalloutActionMenu = js.native
  
  /** Returns the beak orientation defined for the callout during its creation. */
  def getBeakOrientation(): String = js.native
  
  /** Returns the bounding element defined for the callout during its creation. */
  def getBoundingBox(): HTMLElement = js.native
  
  /** Returns the contents of the callout. */
  def getContent(): String = js.native
  
  /** Returns the content element of the callout. */
  def getContentElement(): HTMLElement = js.native
  
  /** Returns the content width defined for the callout during its creation. */
  def getContentWidth(): Double = js.native
  
  /** Returns the ID of the callout. */
  def getID(): String = js.native
  
  /** Returns the launch point element of the callout. */
  def getLaunchPoint(): HTMLElement = js.native
  
  /** Returns the object that represents open behaivor defined for the callout during its creation. */
  def getOpenOptions(): CalloutOpenOptions = js.native
  
  /** Returns the position algorithm function defined for the callout during its creation. */
  def getPositionAlgorithm(): js.Any = js.native
  
  /** Returns the title of the callout. */
  def getTitle(): String = js.native
  
  /** Specifies wherever callout is in "Closed" state */
  def isClosed(): Boolean = js.native
  
  /** Specifies wherever callout is in "Closing" state */
  def isClosing(): Boolean = js.native
  
  /** Specifies wherever callout is in "Opened" state */
  def isOpen(): Boolean = js.native
  
  /** Specifies wherever callout is in "Opened" or "Opening" state */
  def isOpenOrOpening(): Boolean = js.native
  
  /** Specifies wherever callout is in "Opening" state */
  def isOpening(): Boolean = js.native
  
  /** Display the callout. Animation can be used only for IE9+ */
  def open(useAnimation: Boolean): Unit = js.native
  
  /** Re-renders the actions menu. Call after the actions menu is changed. */
  def refreshActions(): Unit = js.native
  
  /** Sets options for the callout. Not all options can be changed for the callout after its creation. */
  def set(options: CalloutOptions): js.Any = js.native
  
  /** Display if hidden, hide if shown. */
  def toggle(): Unit = js.native
}
object Callout {
  
  @scala.inline
  def apply(
    addAction: CalloutAction => Unit,
    addEventCallback: (String, js.Function1[Callout, Unit]) => Unit,
    close: Boolean => Unit,
    destroy: () => Unit,
    getActionMenu: () => CalloutActionMenu,
    getBeakOrientation: () => String,
    getBoundingBox: () => HTMLElement,
    getContent: () => String,
    getContentElement: () => HTMLElement,
    getContentWidth: () => Double,
    getID: () => String,
    getLaunchPoint: () => HTMLElement,
    getOpenOptions: () => CalloutOpenOptions,
    getPositionAlgorithm: () => js.Any,
    getTitle: () => String,
    isClosed: () => Boolean,
    isClosing: () => Boolean,
    isOpen: () => Boolean,
    isOpenOrOpening: () => Boolean,
    isOpening: () => Boolean,
    open: Boolean => Unit,
    refreshActions: () => Unit,
    set: CalloutOptions => js.Any,
    toggle: () => Unit
  ): Callout = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1(addAction), addEventCallback = js.Any.fromFunction2(addEventCallback), close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), getActionMenu = js.Any.fromFunction0(getActionMenu), getBeakOrientation = js.Any.fromFunction0(getBeakOrientation), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getContent = js.Any.fromFunction0(getContent), getContentElement = js.Any.fromFunction0(getContentElement), getContentWidth = js.Any.fromFunction0(getContentWidth), getID = js.Any.fromFunction0(getID), getLaunchPoint = js.Any.fromFunction0(getLaunchPoint), getOpenOptions = js.Any.fromFunction0(getOpenOptions), getPositionAlgorithm = js.Any.fromFunction0(getPositionAlgorithm), getTitle = js.Any.fromFunction0(getTitle), isClosed = js.Any.fromFunction0(isClosed), isClosing = js.Any.fromFunction0(isClosing), isOpen = js.Any.fromFunction0(isOpen), isOpenOrOpening = js.Any.fromFunction0(isOpenOrOpening), isOpening = js.Any.fromFunction0(isOpening), open = js.Any.fromFunction1(open), refreshActions = js.Any.fromFunction0(refreshActions), set = js.Any.fromFunction1(set), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Callout]
  }
  
  @scala.inline
  implicit class CalloutMutableBuilder[Self <: Callout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAction(value: CalloutAction => Unit): Self = StObject.set(x, "addAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddEventCallback(value: (String, js.Function1[Callout, Unit]) => Unit): Self = StObject.set(x, "addEventCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: Boolean => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActionMenu(value: () => CalloutActionMenu): Self = StObject.set(x, "getActionMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBeakOrientation(value: () => String): Self = StObject.set(x, "getBeakOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoundingBox(value: () => HTMLElement): Self = StObject.set(x, "getBoundingBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentElement(value: () => HTMLElement): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentWidth(value: () => Double): Self = StObject.set(x, "getContentWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLaunchPoint(value: () => HTMLElement): Self = StObject.set(x, "getLaunchPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenOptions(value: () => CalloutOpenOptions): Self = StObject.set(x, "getOpenOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPositionAlgorithm(value: () => js.Any): Self = StObject.set(x, "getPositionAlgorithm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClosing(value: () => Boolean): Self = StObject.set(x, "isClosing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpenOrOpening(value: () => Boolean): Self = StObject.set(x, "isOpenOrOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpening(value: () => Boolean): Self = StObject.set(x, "isOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: Boolean => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshActions(value: () => Unit): Self = StObject.set(x, "refreshActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: CalloutOptions => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
