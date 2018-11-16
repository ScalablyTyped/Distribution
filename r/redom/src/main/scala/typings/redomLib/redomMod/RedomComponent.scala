package typings
package redomLib.redomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RedomComponent extends js.Object {
  var el: stdLib.HTMLElement
  var onmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onremount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onunmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* item */ js.Any, 
      /* index */ scala.Double, 
      /* data */ js.Any, 
      /* context */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

