package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jest {
    
    @js.native
    trait Matchers[R, T] extends StObject {
      
      /**
        * Checks if an element's attribute value equals the expect value.
        */
      def toEqualAttribute(expectAttrName: String, expectAttrValue: Any): Unit = js.native
      
      /**
        * Checks if an element's has each of the expected attribute
        * names and values.
        */
      def toEqualAttributes(expectAttrs: StringDictionary[Any]): Unit = js.native
      
      /**
        * Compares HTML, but first normalizes the HTML so all
        * whitespace, attribute order and css class order are
        * the same. When given an element, it will compare
        * the element's `outerHTML`. When given a Document Fragment,
        * such as a Shadow Root, it'll compare its `innerHTML`.
        * Otherwise it'll compare two strings representing HTML.
        */
      def toEqualHtml(expectHtml: String): Unit = js.native
      
      /**
        * Compares HTML light DOKM only, but first normalizes the HTML so all
        * whitespace, attribute order and css class order are
        * the same. When given an element, it will compare
        * the element's `outerHTML`. When given a Document Fragment,
        * such as a Shadow Root, it'll compare its `innerHTML`.
        * Otherwise it'll compare two strings representing HTML.
        */
      def toEqualLightHtml(expectLightHtml: String): Unit = js.native
      
      /**
        * When given an element, it'll compare the element's
        * `textContent`. Otherwise it'll compare two strings. This
        * matcher will also `trim()` each string before comparing.
        */
      def toEqualText(expectTextContent: String): Unit = js.native
      
      /**
        * Checks if an element simply has the attribute. It does
        * not check any values of the attribute
        */
      def toHaveAttribute(expectAttrName: String): Unit = js.native
      
      /**
        * Checks if an element has the expected css class.
        */
      def toHaveClass(expectClassName: String): Unit = js.native
      
      /**
        * Checks if an element has each of the expected css classes
        * in the array.
        */
      def toHaveClasses(expectClassNames: js.Array[String]): Unit = js.native
      
      /**
        * When given an EventSpy, checks the first event has
        * received the correct custom event `detail` data.
        */
      def toHaveFirstReceivedEventDetail(eventDetail: Any): Unit = js.native
      
      /**
        * When given an EventSpy, checks the event at an index
        * has received the correct custom event `detail` data.
        */
      def toHaveNthReceivedEventDetail(index: Double, eventDetail: Any): Unit = js.native
      
      /**
        * When given an EventSpy, checks if the event has been
        * received or not.
        */
      def toHaveReceivedEvent(): Unit = js.native
      
      /**
        * When given an EventSpy, checks the event has
        * received the correct custom event `detail` data.
        */
      def toHaveReceivedEventDetail(eventDetail: Any): Unit = js.native
      
      /**
        * When given an EventSpy, checks how many times the
        * event has been received.
        */
      def toHaveReceivedEventTimes(count: Double): Unit = js.native
      
      /**
        * Checks if an element has the exact same css classes
        * as the expected array of css classes.
        */
      def toMatchClasses(expectClassNames: js.Array[String]): Unit = js.native
      
      /**
        * Used to evaluate the results of `compareScreenshot()`, such as
        * `expect(compare).toMatchScreenshot()`. The `allowableMismatchedRatio`
        * value from the testing config is used by default if
        * `MatchScreenshotOptions` were not provided.
        */
      def toMatchScreenshot(): Unit = js.native
      def toMatchScreenshot(opts: MatchScreenshotOptions): Unit = js.native
    }
  }
}
