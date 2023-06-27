package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSStyleValue")
@js.native
/* standard dom */
open class CSSStyleValue ()
  extends StObject
     with typings.std.CSSStyleValue
object CSSStyleValue {
  
  @JSGlobal("CSSStyleValue")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue/parse) */
  /* standard dom */
  inline def parse(property: java.lang.String, cssText: java.lang.String): typings.std.CSSStyleValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(property.asInstanceOf[js.Any], cssText.asInstanceOf[js.Any])).asInstanceOf[typings.std.CSSStyleValue]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleValue/parseAll) */
  /* standard dom */
  inline def parseAll(property: java.lang.String, cssText: java.lang.String): js.Array[typings.std.CSSStyleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(property.asInstanceOf[js.Any], cssText.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.std.CSSStyleValue]]
}
