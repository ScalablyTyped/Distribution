package typings.std.global

import typings.std.IntersectionObserverCallback
import typings.std.IntersectionObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserver protected ()
  extends StObject
     with typings.std.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /* CompleteClass */
  override def observe(target: typings.std.Element): Unit = js.native
  
  /* CompleteClass */
  override val root: typings.std.Element | Null = js.native
  
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  
  /* CompleteClass */
  override def takeRecords(): js.Array[typings.std.IntersectionObserverEntry] = js.native
  
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def unobserve(target: typings.std.Element): Unit = js.native
}
