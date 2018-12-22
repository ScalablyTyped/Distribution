package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait whereStatic
  extends org.scalablytyped.runtime.Instantiable2[
      /* attr */ js.Object, 
      (/* logic */ js.Object) | (/* logic */ java.lang.String), 
      where
    ]
     with /**
         * A way of specifying attr = condition.
         *
         * The attr can either be an object taken from `Model.rawAttributes` (for example `Model.rawAttributes.id`
         * or
         * `Model.rawAttributes.name`). The attribute should be defined in your model definition. The attribute can
         * also be an object from one of the sequelize utility functions (`sequelize.fn`, `sequelize.col` etc.)
         *
         * For string attributes, use the regular `{ where: { attr: something }}` syntax. If you don't want your
         * string to be escaped, use `sequelize.literal`.
         *
         * @param attr The attribute, which can be either an attribute object from `Model.rawAttributes` or a
         *     sequelize object, for example an instance of `sequelize.fn`. For simple string attributes, use the
         *     POJO syntax
         * @param comparator Comparator
         * @param logic The condition. Can be both a simply type, or a further condition (`.or`, `.and`, `.literal`
         *     etc.)
         */
org.scalablytyped.runtime.Instantiable3[
      /* attr */ js.Object, 
      /* comparator */ java.lang.String, 
      (/* logic */ js.Object) | (/* logic */ java.lang.String), 
      where
    ]

