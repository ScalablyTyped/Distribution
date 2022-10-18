package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontStyle extends StObject
@JSImport("shiki", "FontStyle")
@js.native
object FontStyle extends StObject {
  
  @js.native
  sealed trait Bold
    extends StObject
       with FontStyle
  
  @js.native
  sealed trait Italic
    extends StObject
       with FontStyle
  
  @js.native
  sealed trait None
    extends StObject
       with FontStyle
  
  @js.native
  sealed trait NotSet
    extends StObject
       with FontStyle
  
  @js.native
  sealed trait Underline
    extends StObject
       with FontStyle
}
