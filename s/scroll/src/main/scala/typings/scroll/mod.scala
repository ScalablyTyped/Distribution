package typings.scroll

import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("scroll", "left")
  @js.native
  def left: Scroll = js.native
  @scala.inline
  def left(el: HTMLElement, to: Double): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def left(el: HTMLElement, to: Double, opts: Unit, cb: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def left(el: HTMLElement, to: Double, opts: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def left(el: HTMLElement, to: Double, opts: ScrollCallback, cb: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def left(el: HTMLElement, to: Double, opts: ScrollOptions): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def left(el: HTMLElement, to: Double, opts: ScrollOptions, cb: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def left_=(x: Scroll): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
  
  @JSImport("scroll", "top")
  @js.native
  def top: Scroll = js.native
  @scala.inline
  def top(el: HTMLElement, to: Double): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("top")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def top(el: HTMLElement, to: Double, opts: Unit, cb: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("top")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def top(el: HTMLElement, to: Double, opts: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("top")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def top(el: HTMLElement, to: Double, opts: ScrollCallback, cb: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("top")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def top(el: HTMLElement, to: Double, opts: ScrollOptions): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("top")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def top(el: HTMLElement, to: Double, opts: ScrollOptions, cb: ScrollCallback): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("top")(el.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  @scala.inline
  def top_=(x: Scroll): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  
  type Cancel = js.Function0[Unit]
  
  type Scroll = js.Function4[
    /* el */ HTMLElement, 
    /* to */ Double, 
    /* opts */ js.UndefOr[ScrollOptions | ScrollCallback], 
    /* cb */ js.UndefOr[ScrollCallback], 
    Cancel
  ]
  
  type ScrollCallback = js.Function2[/* error */ ScrollError, /* value */ Double, Unit]
  
  type ScrollError = Error | Null
  
  trait ScrollOptions extends StObject {
    
    /**
      * Animation duration
      * @default 350
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Ease function
      * @default easeInOut
      */
    var ease: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.undefined
  }
  object ScrollOptions {
    
    @scala.inline
    def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: /* time */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    }
  }
}
