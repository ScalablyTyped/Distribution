package typings
package selectizeLib.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Custom rendering functions. Each function should accept two arguments: "data" and "escape" and return
     * HTML (string) with a single root element. The "escape" argument is a function that takes a string and
     * escapes all special HTML characters. This is very important to use to prevent XSS vulnerabilities.
     */

trait ICustomRenderers[U] extends js.Object {
  // An item the user has selected.
  var item: js.UndefOr[
    js.Function2[
      /* data */ U, 
      /* escape */ js.Function1[/* input */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  // The wrapper for an optgroup. The "html" property in the data will be the raw html of the optgroup's header
  // and options.
  var optgroup: js.UndefOr[
    js.Function2[
      /* data */ U, 
      /* escape */ js.Function1[/* input */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  // The header of an option group.
  var optgroup_header: js.UndefOr[
    js.Function2[
      /* data */ U, 
      /* escape */ js.Function1[/* input */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  // An option in the dropdown list of available options.
  var option: js.UndefOr[
    js.Function2[
      /* data */ U, 
      /* escape */ js.Function1[/* input */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  // The "create new" option at the bottom of the dropdown. The data contains one property: "input"
  // (which is what the user has typed).
  var option_create: js.UndefOr[
    js.Function2[
      /* data */ U, 
      /* escape */ js.Function1[/* input */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
}

