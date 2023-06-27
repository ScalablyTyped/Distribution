package typings.std.global

import typings.std.ReportList
import typings.std.ReportingObserverCallback
import typings.std.ReportingObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReportingObserver")
@js.native
open class ReportingObserver protected ()
  extends StObject
     with typings.std.ReportingObserver {
  /* standard dom */
  def this(callback: ReportingObserverCallback) = this()
  def this(callback: ReportingObserverCallback, options: ReportingObserverOptions) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/disconnect) */
  /* standard dom */
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/observe) */
  /* standard dom */
  /* CompleteClass */
  override def observe(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/takeRecords) */
  /* standard dom */
  /* CompleteClass */
  override def takeRecords(): ReportList = js.native
}
