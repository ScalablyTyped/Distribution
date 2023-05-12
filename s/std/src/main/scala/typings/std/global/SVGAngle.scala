package typings.std.global

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGAngle")
@js.native
/* standard dom */
open class SVGAngle ()
  extends StObject
     with typings.std.SVGAngle {
  
  /* standard dom */
  /* CompleteClass */
  override val SVG_ANGLETYPE_DEG: `2` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val SVG_ANGLETYPE_GRAD: `4` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val SVG_ANGLETYPE_RAD: `3` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val SVG_ANGLETYPE_UNKNOWN: `0` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val SVG_ANGLETYPE_UNSPECIFIED: `1` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val unitType: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  var value: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  var valueAsString: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var valueInSpecifiedUnits: Double = js.native
}
object SVGAngle {
  
  /* standard dom */
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_DEG")
  @js.native
  val SVG_ANGLETYPE_DEG: `2` = js.native
  
  /* standard dom */
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_GRAD")
  @js.native
  val SVG_ANGLETYPE_GRAD: `4` = js.native
  
  /* standard dom */
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_RAD")
  @js.native
  val SVG_ANGLETYPE_RAD: `3` = js.native
  
  /* standard dom */
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_UNKNOWN")
  @js.native
  val SVG_ANGLETYPE_UNKNOWN: `0` = js.native
  
  /* standard dom */
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_UNSPECIFIED")
  @js.native
  val SVG_ANGLETYPE_UNSPECIFIED: `1` = js.native
}
