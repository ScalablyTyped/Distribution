package typings.prismicDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prismicDashDomMod {
  type Elements = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in prismic-dom.prismic-dom.ElementType ]: string}
    */ typings.prismicDashDom.prismicDashDomStrings.Elements with js.Any
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ js.Any, 
    /* text */ String | Null, 
    /* children */ js.Array[T], 
    /* index */ Double, 
    T
  ]
}
