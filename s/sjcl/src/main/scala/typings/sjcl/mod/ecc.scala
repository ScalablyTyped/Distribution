package typings.sjcl.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecc extends Shortcut {
  
  @JSImport("sjcl", "ecc")
  @js.native
  val ^ : SjclEllipticCurveCryptography = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "ecc.curve")
  @js.native
  class curve protected () extends SjclEllipticalCurve {
    def this(Field: BigNumber, r: BigNumber, a: BigNumber, b: BigNumber, x: BigNumber, y: BigNumber) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "ecc.point")
  @js.native
  class point protected () extends SjclEllipticalPoint {
    def this(curve: SjclEllipticalCurve) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: js.UndefOr[scala.Nothing], y: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "ecc.pointJac")
  @js.native
  class pointJac protected () extends SjclPointJacobian {
    def this(curve: SjclEllipticalCurve) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: js.UndefOr[scala.Nothing], y: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
    def this(
      curve: SjclEllipticalCurve,
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: BigNumber
    ) = this()
    def this(curve: SjclEllipticalCurve, x: js.UndefOr[scala.Nothing], y: BigNumber, z: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: js.UndefOr[scala.Nothing], z: BigNumber) = this()
    def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber, z: BigNumber) = this()
  }
  
  type _To = SjclEllipticCurveCryptography
  
  /* This means you don't have to write `^`, but can instead just say `ecc.foo` */
  override def _to: SjclEllipticCurveCryptography = ^
}
