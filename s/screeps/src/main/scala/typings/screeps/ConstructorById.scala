package typings.screeps

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorById[T]
  extends Constructor[T]
     with Instantiable1[/* id */ Id[T], T] {
  
  def apply(id: Id[T]): T = js.native
}
