package typings.skiaCanvas.libMod

import typings.node.bufferMod.global.Buffer
import typings.skiaCanvas.libMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def loadImage(src: String): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]
inline def loadImage(src: Buffer): js.Promise[Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Image]]

type CornerRadius = Double | DOMPoint

//
// Context
//
type Offset = (js.Tuple2[/* x */ Double, /* y */ Double]) | Double

type Path2DEdge = /* args */ Array[String | Double]

type QuadOrRect = (js.Tuple8[
/* x1 */ Double, 
/* y1 */ Double, 
/* x2 */ Double, 
/* y2 */ Double, 
/* x3 */ Double, 
/* y3 */ Double, 
/* x4 */ Double, 
/* y4 */ Double]) | (js.Tuple4[/* left */ Double, /* top */ Double, /* right */ Double, /* bottom */ Double]) | (js.Tuple2[/* width */ Double, /* height */ Double])
