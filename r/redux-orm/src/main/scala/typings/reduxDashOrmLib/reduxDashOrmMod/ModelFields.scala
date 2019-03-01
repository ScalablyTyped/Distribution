package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFields
  extends /* index */ org.scalablytyped.runtime.StringDictionary[Attribute | ForeignKey | ManyToMany | OneToOne]

object ModelFields {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[Attribute | ForeignKey | ManyToMany | OneToOne] = null
  ): ModelFields = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ModelFields]
  }
}

