package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Colors {
  
  @JSImport("seen", "Colors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seen", "Colors.CSS_RGBA_STRING_REGEX")
  @js.native
  def CSS_RGBA_STRING_REGEX: js.RegExp = js.native
  inline def CSS_RGBA_STRING_REGEX_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSS_RGBA_STRING_REGEX")(x.asInstanceOf[js.Any])
  
  inline def black(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("black")().asInstanceOf[Color]
  
  inline def gray(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("gray")().asInstanceOf[Color]
  
  inline def hex(hex: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(hex.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def hsl(h: Double, s: Double, l: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def hsl(h: Double, s: Double, l: Double, a: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  inline def parse(str: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def randomShape(shape: Shape): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randomShape")(shape.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def randomShape(shape: Shape, sat: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomShape")(shape.asInstanceOf[js.Any], sat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomShape(shape: Shape, sat: Double, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomShape")(shape.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomShape(shape: Shape, sat: Unit, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomShape")(shape.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def randomSurfaces(shape: Shape): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces")(shape.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def randomSurfaces(shape: Shape, sat: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces")(shape.asInstanceOf[js.Any], sat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces(shape: Shape, sat: Double, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces")(shape.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces(shape: Shape, sat: Unit, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces")(shape.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def randomSurfaces2(shape: Shape): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Double, sat: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any], sat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Double, sat: Double, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Double, sat: Unit, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Unit, sat: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any], sat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Unit, sat: Double, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def randomSurfaces2(shape: Shape, drift: Unit, sat: Unit, lit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSurfaces2")(shape.asInstanceOf[js.Any], drift.asInstanceOf[js.Any], sat.asInstanceOf[js.Any], lit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rgb(r: Double, g: Double, b: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def rgb(r: Double, g: Double, b: Double, a: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  inline def white(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("white")().asInstanceOf[Color]
}
