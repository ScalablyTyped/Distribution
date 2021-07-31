package typings.std.global

import typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGRect")
@js.native
class SVGRect ()
  extends StObject
     with typings.std.DOMRect {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  
  /* CompleteClass */
  override val bottom: Double = js.native
  
  /* CompleteClass */
  override val height: Double = js.native
  
  /* CompleteClass */
  override val left: Double = js.native
  
  /* CompleteClass */
  override val right: Double = js.native
  
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  
  /* CompleteClass */
  override val top: Double = js.native
  
  /* CompleteClass */
  override val width: Double = js.native
  
  /* CompleteClass */
  override val x: Double = js.native
  
  /* CompleteClass */
  override val y: Double = js.native
}
/* was `typeof DOMRect` */
object SVGRect {
  
  @JSGlobal("SVGRect")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromRect(): typings.std.DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[typings.std.DOMRect]
  @scala.inline
  def fromRect(other: DOMRectInit): typings.std.DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMRect]
}
