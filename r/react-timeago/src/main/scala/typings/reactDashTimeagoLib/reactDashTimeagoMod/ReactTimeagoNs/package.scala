package typings
package reactDashTimeagoLib.reactDashTimeagoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTimeagoNs {
  type Formatter = js.Function5[
    /* value */ scala.Double, 
    /* unit */ Unit, 
    /* suffix */ Suffix, 
    /* epochMiliseconds */ scala.Double, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-timeago.react-timeago.ReactTimeago.Formatter */ /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-timeago.react-timeago.ReactTimeago.Formatter */ js.Object
    ], 
    reactLib.reactMod.ReactNs.ReactNode
  ]
  type Suffix = reactDashTimeagoLib.reactDashTimeagoLibStrings.ago | (reactDashTimeagoLib.reactDashTimeagoLibStrings.`from now`)
  type Unit = reactDashTimeagoLib.reactDashTimeagoLibStrings.second | reactDashTimeagoLib.reactDashTimeagoLibStrings.minute | reactDashTimeagoLib.reactDashTimeagoLibStrings.hour | reactDashTimeagoLib.reactDashTimeagoLibStrings.day | reactDashTimeagoLib.reactDashTimeagoLibStrings.week | reactDashTimeagoLib.reactDashTimeagoLibStrings.month | reactDashTimeagoLib.reactDashTimeagoLibStrings.year
}
