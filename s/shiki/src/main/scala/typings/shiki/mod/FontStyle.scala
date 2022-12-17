package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontStyle extends StObject
@JSImport("shiki", "FontStyle")
@js.native
object FontStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle & Double] = js.native
  
  @js.native
  sealed trait Bold
    extends StObject
       with FontStyle
  /* 2 */ val Bold: typings.shiki.mod.FontStyle.Bold & Double = js.native
  
  @js.native
  sealed trait Italic
    extends StObject
       with FontStyle
  /* 1 */ val Italic: typings.shiki.mod.FontStyle.Italic & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with FontStyle
  /* 0 */ val None: typings.shiki.mod.FontStyle.None & Double = js.native
  
  @js.native
  sealed trait NotSet
    extends StObject
       with FontStyle
  /* -1 */ val NotSet: typings.shiki.mod.FontStyle.NotSet & Double = js.native
  
  @js.native
  sealed trait Underline
    extends StObject
       with FontStyle
  /* 4 */ val Underline: typings.shiki.mod.FontStyle.Underline & Double = js.native
}
