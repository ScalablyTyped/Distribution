package typings.reactMentions

import typings.reactMentions.libUtilsApplyChangeToValueMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsIterateMentionsMarkupMod {
  
  @JSImport("react-mentions/lib/utils/iterateMentionsMarkup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iterateMentionsMarkup(value: String, config: js.Array[Config], markupIteratee: MarkupIterateeFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateMentionsMarkup")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any], markupIteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def iterateMentionsMarkup(
    value: String,
    config: js.Array[Config],
    markupIteratee: MarkupIterateeFunction,
    textIteratee: TextIterateeFunction
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateMentionsMarkup")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any], markupIteratee.asInstanceOf[js.Any], textIteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MarkupIterateeFunction = js.Function7[
    /* match */ String, 
    /* index */ Double, 
    /* plainTextIndex */ Double, 
    /* id */ String | Double, 
    /* display */ String, 
    /* childIndex */ Double, 
    /* start */ Double, 
    Unit
  ]
  
  type TextIterateeFunction = js.Function3[/* substr */ String, /* start */ Double, /* plainTextIndex */ Double, Unit]
}
