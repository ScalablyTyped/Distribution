package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormSectionMod {
  type GenericFormSection[P] = reactLib.reactMod.Component[
    P with FormSectionProps[P] with (FormSectionProps[P with FormSectionProps[P]]), 
    js.Object, 
    js.Any
  ]
}
