package typings
package prettierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ast extends js.Object {
  var endOfLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ java.lang.String, 
      /* options */ prettierLib.prettierMod.ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ scala.Boolean, 
      scala.Boolean
    ]
  ] = js.undefined
  var ownLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ java.lang.String, 
      /* options */ prettierLib.prettierMod.ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ scala.Boolean, 
      scala.Boolean
    ]
  ] = js.undefined
  var remaining: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ java.lang.String, 
      /* options */ prettierLib.prettierMod.ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ scala.Boolean, 
      scala.Boolean
    ]
  ] = js.undefined
}

object Anon_Ast {
  @scala.inline
  def apply(
    endOfLine: (/* commentNode */ js.Any, /* text */ java.lang.String, /* options */ prettierLib.prettierMod.ParserOptions, /* ast */ js.Any, /* isLastComment */ scala.Boolean) => scala.Boolean = null,
    ownLine: (/* commentNode */ js.Any, /* text */ java.lang.String, /* options */ prettierLib.prettierMod.ParserOptions, /* ast */ js.Any, /* isLastComment */ scala.Boolean) => scala.Boolean = null,
    remaining: (/* commentNode */ js.Any, /* text */ java.lang.String, /* options */ prettierLib.prettierMod.ParserOptions, /* ast */ js.Any, /* isLastComment */ scala.Boolean) => scala.Boolean = null
  ): Anon_Ast = {
    val __obj = js.Dynamic.literal()
    if (endOfLine != null) __obj.updateDynamic("endOfLine")(js.Any.fromFunction5(endOfLine))
    if (ownLine != null) __obj.updateDynamic("ownLine")(js.Any.fromFunction5(ownLine))
    if (remaining != null) __obj.updateDynamic("remaining")(js.Any.fromFunction5(remaining))
    __obj.asInstanceOf[Anon_Ast]
  }
}

