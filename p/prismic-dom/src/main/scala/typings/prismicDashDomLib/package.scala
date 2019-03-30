package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prismicDashDomLib {
  type Elements = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in prismic-dom.ElementType ]: string}
    */ prismicDashDomLib.prismicDashDomLibStrings.Elements with js.Any
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ js.Any, 
    /* text */ java.lang.String | scala.Null, 
    /* children */ js.Array[T], 
    /* index */ scala.Double, 
    T
  ]
}
