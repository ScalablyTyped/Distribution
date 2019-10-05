package typings.refDashArray.refDashArrayMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.ref.refMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-array", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* type */ Type, ArrayType[js.Object]]) with (Instantiable2[/* type */ Type, /* length */ Double, ArrayType[js.Object]]) with (Instantiable1[/* type */ String, ArrayType[js.Object]]) with (Instantiable2[/* type */ String, /* length */ Double, ArrayType[js.Object]])
    ] {
  def apply[T](`type`: String): ArrayType[T] = js.native
  def apply[T](`type`: String, length: Double): ArrayType[T] = js.native
  def apply[T](`type`: Type): ArrayType[T] = js.native
  def apply[T](`type`: Type, length: Double): ArrayType[T] = js.native
}

