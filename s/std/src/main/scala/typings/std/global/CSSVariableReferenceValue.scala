package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSVariableReferenceValue")
@js.native
open class CSSVariableReferenceValue protected ()
  extends StObject
     with typings.std.CSSVariableReferenceValue {
  /* standard dom */
  def this(variable: java.lang.String) = this()
  def this(variable: java.lang.String, fallback: typings.std.CSSUnparsedValue) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue/fallback) */
  /* standard dom */
  /* CompleteClass */
  override val fallback: typings.std.CSSUnparsedValue | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue/variable) */
  /* standard dom */
  /* CompleteClass */
  var variable: java.lang.String = js.native
}
