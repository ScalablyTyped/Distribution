package typings.slideout

import typings.slideout.slideoutStrings.left
import typings.slideout.slideoutStrings.right
import typings.slideout.slideoutStrings.translate
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A touch slideout navigation menu for your mobile web apps.
    */
  @JSImport("slideout", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Slideout {
    /**
      * A touch slideout navigation menu for your mobile web apps.
      * @param options Options to customize a new instance of Slideout.
      */
    def this(options: Options) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.slideout.slideoutStrings.beforeopen
    - typings.slideout.slideoutStrings.open
    - typings.slideout.slideoutStrings.beforeclose
    - typings.slideout.slideoutStrings.close
    - typings.slideout.slideoutStrings.translatestart
    - typings.slideout.slideoutStrings.translate
    - typings.slideout.slideoutStrings.translateend
  */
  trait Events extends StObject
  object Events {
    
    @scala.inline
    def beforeclose: typings.slideout.slideoutStrings.beforeclose = "beforeclose".asInstanceOf[typings.slideout.slideoutStrings.beforeclose]
    
    @scala.inline
    def beforeopen: typings.slideout.slideoutStrings.beforeopen = "beforeopen".asInstanceOf[typings.slideout.slideoutStrings.beforeopen]
    
    @scala.inline
    def close: typings.slideout.slideoutStrings.close = "close".asInstanceOf[typings.slideout.slideoutStrings.close]
    
    @scala.inline
    def open: typings.slideout.slideoutStrings.open = "open".asInstanceOf[typings.slideout.slideoutStrings.open]
    
    @scala.inline
    def translate: typings.slideout.slideoutStrings.translate = "translate".asInstanceOf[typings.slideout.slideoutStrings.translate]
    
    @scala.inline
    def translateend: typings.slideout.slideoutStrings.translateend = "translateend".asInstanceOf[typings.slideout.slideoutStrings.translateend]
    
    @scala.inline
    def translatestart: typings.slideout.slideoutStrings.translatestart = "translatestart".asInstanceOf[typings.slideout.slideoutStrings.translatestart]
  }
  
  /**
    * Options to customize a new instance of Slideout.
    */
  trait Options extends StObject {
    
    /**
      * The time (milliseconds) to open/close the slideout.
      * Default: 300.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The CSS effect to use when animating the opening and closing of the slideout.
      * Default: ease.
      */
    var fx: js.UndefOr[String] = js.undefined
    
    /**
      * The DOM element that contains your menu application (.slideout-menu).
      */
    var menu: HTMLElement
    
    /**
      *   Default: 256.
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * The DOM element that contains all your application content (.slideout-panel).
      */
    var panel: HTMLElement
    
    /**
      * The side to open the slideout.
      * Default: left.
      */
    var side: js.UndefOr[left | right] = js.undefined
    
    /**
      * The number of px needed for the menu can be opened completely, otherwise it closes.
      * Default: 70.
      */
    var tolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Set this option to false to disable Slideout touch events.
      * Default: true.
      */
    var touch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(menu: HTMLElement, panel: HTMLElement): Options = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setMenu(value: HTMLElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPanel(value: HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide(value: left | right): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    }
  }
  
  /**
    * A touch slideout navigation menu for your mobile web apps.
    */
  @js.native
  trait Slideout extends StObject {
    
    /**
      * Closes the slideout menu. It emits beforeclose and close events.
      */
    def close(): Slideout = js.native
    
    /**
      * Cleans up the instance so another slideout can be created on the same area.
      */
    def destroy(): Slideout = js.native
    
    /**
      * Disables opening the slideout via touch events.
      */
    def disableTouch(): Slideout = js.native
    
    /**
      * Execute each item in the listener collection in order with the specified data.
      * @param event The name of the event you want to emit.
      * @param data Data to pass to the listeners.
      */
    def emit(event: Events, data: js.Any*): Slideout = js.native
    
    /**
      * Enables opening the slideout via touch events.
      */
    def enableTouch(): Slideout = js.native
    
    /**
      * Returns true if the slideout is currently open, and false if it is closed.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Removes a listener from the collection for the specified event.
      * @param event The event name.
      * @param listener A listener function to remove.
      */
    def off(event: Events, listener: js.Function): Slideout = js.native
    /**
      * Removes a listener from the collection for the specified event.
      * @param event The event name.
      * @param listener A listener function to remove.
      */
    @JSName("off")
    def off_translate(event: translate, listener: js.Function1[/* translateX */ Double, js.Any]): Slideout = js.native
    
    /**
      * Adds a listener to the collection for the specified event.
      * @param event The event name.
      * @param listener A listener function to add.
      */
    def on(event: Events, listener: js.Function): Slideout = js.native
    /**
      * Adds a listener to the collection for the specified event.
      * @param event The event name.
      * @param listener A listener function to add.
      */
    @JSName("on")
    def on_translate(event: translate, listener: js.Function1[/* translateX */ Double, js.Any]): Slideout = js.native
    
    /**
      * Adds a listener to the collection for the specified event that will be called only once.
      * @param event The event name.
      * @param listener A listener function to add.
      */
    def once(event: Events, listener: js.Function): Slideout = js.native
    /**
      * Adds a listener to the collection for the specified event that will be called only once.
      * @param event The event name.
      * @param listener A listener function to add.
      */
    @JSName("once")
    def once_translate(event: translate, listener: js.Function1[/* translateX */ Double, js.Any]): Slideout = js.native
    
    /**
      * Opens the slideout menu. It emits beforeopen and open events.
      */
    def open(): Slideout = js.native
    
    /**
      * Toggles (open/close) the slideout menu.
      */
    def toggle(): Slideout = js.native
  }
}
