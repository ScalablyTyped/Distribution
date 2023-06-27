package typings.std.global

import typings.std.DOMPointInit
import typings.std.DOMQuadInit
import typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMQuad")
@js.native
/* standard dom */
open class DOMQuad ()
  extends StObject
     with typings.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/getBounds) */
  /* standard dom */
  /* CompleteClass */
  override def getBounds(): typings.std.DOMRect = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p1) */
  /* standard dom */
  /* CompleteClass */
  override val p1: typings.std.DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p2) */
  /* standard dom */
  /* CompleteClass */
  override val p2: typings.std.DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p3) */
  /* standard dom */
  /* CompleteClass */
  override val p3: typings.std.DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p4) */
  /* standard dom */
  /* CompleteClass */
  override val p4: typings.std.DOMPoint = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
object DOMQuad {
  
  @JSGlobal("DOMQuad")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def fromQuad(): typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")().asInstanceOf[typings.std.DOMQuad]
  inline def fromQuad(other: DOMQuadInit): typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMQuad]
  
  /* standard dom */
  inline def fromRect(): typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[typings.std.DOMQuad]
  inline def fromRect(other: DOMRectInit): typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMQuad]
}
