package typings.screenfull

import typings.std.Element
import typings.std.Event
import typings.std.FullscreenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Simple wrapper for cross-browser usage of the JavaScript [Fullscreen API](https://developer.mozilla.org/en/DOM/Using_full-screen_mode), which lets you bring the page or any element into fullscreen. Smoothens out the browser implementation differences, so you don't have to.
  */
  object default {
    
    @JSImport("screenfull", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	The element currently in fullscreen, otherwise `undefined`.
    	*/
    @JSImport("screenfull", "default.element")
    @js.native
    val element: js.UndefOr[Element] = js.native
    
    /**
    	Brings you out of fullscreen.
    	@returns A promise that resolves after the element exits fullscreen.
    	*/
    inline def exit(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[js.Promise[Unit]]
    
    /**
    	Whether you are allowed to enter fullscreen. If your page is inside an `<iframe>` you will need to add a `allowfullscreen` attribute (+ `webkitallowfullscreen` and `mozallowfullscreen`).
    	@example
    	```
    	import screenfull from 'screenfull';
    	if (screenfull.isEnabled) {
    		screenfull.request();
    	}
    	```
    	*/
    @JSImport("screenfull", "default.isEnabled")
    @js.native
    val isEnabled: Boolean = js.native
    
    /**
    	Whether fullscreen is active.
    	*/
    @JSImport("screenfull", "default.isFullscreen")
    @js.native
    val isFullscreen: Boolean = js.native
    
    /**
    	Remove a previously registered event listener.
    	@example
    	```
    	import screenfull from 'screenfull';
    	screenfull.off('change', callback);
    	```
    	*/
    inline def off(name: EventName, handler: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
    	Add a listener for when the browser switches in and out of fullscreen or when there is an error.
    	@example
    	```
    	import screenfull from 'screenfull';
    	// Detect fullscreen change
    	if (screenfull.isEnabled) {
    		screenfull.on('change', () => {
    			console.log('Am I fullscreen?', screenfull.isFullscreen ? 'Yes' : 'No');
    		});
    	}
    	// Detect fullscreen error
    	if (screenfull.isEnabled) {
    		screenfull.on('error', event => {
    			console.error('Failed to enable fullscreen', event);
    		});
    	}
    	```
    	*/
    inline def on(name: EventName, handler: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
    	Alias for `.on('change', function)`.
    	*/
    inline def onchange(handler: js.Function1[/* event */ Event, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onchange")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
    	Alias for `.on('error', function)`.
    	*/
    inline def onerror(handler: js.Function1[/* event */ Event, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onerror")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
    	Exposes the raw properties (prefixed if needed) used internally.
    	*/
    @JSImport("screenfull", "default.raw")
    @js.native
    def raw: RawEventNames = js.native
    inline def raw_=(x: RawEventNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raw")(x.asInstanceOf[js.Any])
    
    /**
    	Make an element fullscreen.
    	If your page is inside an `<iframe>` you will need to add a `allowfullscreen` attribute (+ `webkitallowfullscreen` and `mozallowfullscreen`).
    	Keep in mind that the browser will only enter fullscreen when initiated by user events like click, touch, key.
    	@param element - Default is `<html>`. If called with another element than the currently active, it will switch to that if it's a descendant.
    	@param options - [`FullscreenOptions`](https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions).
    	@returns A promise that resolves after the element enters fullscreen.
    	@example
    	```
    	import screenfull from 'screenfull';
    	// Fullscreen the page
    	document.getElementById('button').addEventListener('click', () => {
    		if (screenfull.isEnabled) {
    			screenfull.request();
    		} else {
    			// Ignore or do something else
    		}
    	});
    	// Fullscreen an element
    	const element = document.getElementById('target');
    	document.getElementById('button').addEventListener('click', () => {
    		if (screenfull.isEnabled) {
    			screenfull.request(element);
    		}
    	});
    	// Fullscreen an element with options
    	const element = document.getElementById('target');
    	document.getElementById('button').addEventListener('click', () => {
    		if (screenfull.isEnabled) {
    			screenfull.request(element, {navigationUI: 'hide'});
    		}
    	});
    	// Fullscreen an element with jQuery
    	const element = $('#target')[0]; // Get DOM element from jQuery collection
    	$('#button').on('click', () => {
    		if (screenfull.isEnabled) {
    			screenfull.request(element);
    		}
    	});
    	```
    	*/
    inline def request(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[js.Promise[Unit]]
    inline def request(element: Unit, options: FullscreenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def request(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def request(element: Element, options: FullscreenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
    	Requests fullscreen if not active, otherwise exits.
    	@param element - The default is `<html>`. If called with another element than the currently active, it will switch to that if it's a descendant.
    	@param options - [`FullscreenOptions`](https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions).
    	@returns A promise that resolves after the element enters/exits fullscreen.
    	@example
    	```
    	import screenfull from 'screenfull';
    	// Toggle fullscreen on a image with jQuery
    	$('img').on('click', event => {
    		if (screenfull.isEnabled) {
    			screenfull.toggle(event.target);
    		}
    	});
    	```
    	*/
    inline def toggle(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[js.Promise[Unit]]
    inline def toggle(element: Unit, options: FullscreenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def toggle(element: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def toggle(element: Element, options: FullscreenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.screenfull.screenfullStrings.change
    - typings.screenfull.screenfullStrings.error
  */
  trait EventName extends StObject
  object EventName {
    
    inline def change: typings.screenfull.screenfullStrings.change = "change".asInstanceOf[typings.screenfull.screenfullStrings.change]
    
    inline def error: typings.screenfull.screenfullStrings.error = "error".asInstanceOf[typings.screenfull.screenfullStrings.error]
  }
  
  trait RawEventNames extends StObject {
    
    val exitFullscreen: String
    
    val fullscreenElement: String
    
    val fullscreenEnabled: String
    
    val fullscreenchange: String
    
    val fullscreenerror: String
    
    val requestFullscreen: String
  }
  object RawEventNames {
    
    inline def apply(
      exitFullscreen: String,
      fullscreenElement: String,
      fullscreenEnabled: String,
      fullscreenchange: String,
      fullscreenerror: String,
      requestFullscreen: String
    ): RawEventNames = {
      val __obj = js.Dynamic.literal(exitFullscreen = exitFullscreen.asInstanceOf[js.Any], fullscreenElement = fullscreenElement.asInstanceOf[js.Any], fullscreenEnabled = fullscreenEnabled.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], requestFullscreen = requestFullscreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawEventNames]
    }
    
    extension [Self <: RawEventNames](x: Self) {
      
      inline def setExitFullscreen(value: String): Self = StObject.set(x, "exitFullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenElement(value: String): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
      
      inline def setFullscreenEnabled(value: String): Self = StObject.set(x, "fullscreenEnabled", value.asInstanceOf[js.Any])
      
      inline def setFullscreenchange(value: String): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setFullscreenerror(value: String): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      inline def setRequestFullscreen(value: String): Self = StObject.set(x, "requestFullscreen", value.asInstanceOf[js.Any])
    }
  }
}
