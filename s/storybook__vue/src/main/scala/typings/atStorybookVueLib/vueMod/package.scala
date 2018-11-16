package typings
package atStorybookVueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueMod {
  type StoryDecorator = js.Function2[
    /* story */ js.Function0[
      vueLib.typesOptionsMod.ComponentOptions[
        vueLib.typesVueMod.Vue, 
        vueLib.typesOptionsMod.DefaultData[vueLib.typesVueMod.Vue], 
        vueLib.typesOptionsMod.DefaultMethods[vueLib.typesVueMod.Vue], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
        vueLib.typesOptionsMod.DefaultProps
      ]
    ], 
    /* context */ atStorybookVueLib.Anon_Kind, 
    (vueLib.typesOptionsMod.ComponentOptions[
      vueLib.typesVueMod.Vue, 
      vueLib.typesOptionsMod.DefaultData[vueLib.typesVueMod.Vue], 
      vueLib.typesOptionsMod.DefaultMethods[vueLib.typesVueMod.Vue], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
      vueLib.typesOptionsMod.DefaultProps
    ]) | scala.Null
  ]
  type StoryFunction = js.Function0[
    (vueLib.typesOptionsMod.ComponentOptions[
      vueLib.typesVueMod.Vue, 
      vueLib.typesOptionsMod.DefaultData[vueLib.typesVueMod.Vue], 
      vueLib.typesOptionsMod.DefaultMethods[vueLib.typesVueMod.Vue], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
      vueLib.typesOptionsMod.DefaultProps
    ]) | java.lang.String
  ]
}
