package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Report")
@js.native
/* standard dom */
open class Report ()
  extends StObject
     with typings.std.Report {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/body) */
  /* standard dom */
  /* CompleteClass */
  override val body: typings.std.ReportBody | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/url) */
  /* standard dom */
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
