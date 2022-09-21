package typings.std.global

import typings.std.DOMPointInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMPointReadOnly")
@js.native
/* standard dom */
open class DOMPointReadOnly ()
  extends StObject
     with typings.std.DOMPointReadOnly {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
object DOMPointReadOnly {
  
  @JSGlobal("DOMPointReadOnly")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def fromPoint(): typings.std.DOMPointReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[typings.std.DOMPointReadOnly]
  inline def fromPoint(other: DOMPointInit): typings.std.DOMPointReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMPointReadOnly]
}
