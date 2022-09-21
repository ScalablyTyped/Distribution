package typings.seen.mod

import typings.seen.anon.F
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "ObjParser")
@js.native
open class ObjParser () extends StObject {
  
  var commands: F = js.native
  
  var faces: js.Array[js.Array[Double]] = js.native
  
  def mapFacePoints(faceMap: js.Function1[/* points */ js.Array[Point], Any]): Unit = js.native
  
  def parse(contents: String): Unit = js.native
  
  var vertices: js.Array[js.Array[Double]] = js.native
}
