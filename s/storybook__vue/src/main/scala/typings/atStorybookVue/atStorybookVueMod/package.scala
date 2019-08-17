package typings.atStorybookVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookVueMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStorybookVue.Anon_Kind
  import typings.vue.typesOptionsMod.ComponentOptions
  import typings.vue.typesOptionsMod.DefaultComputed
  import typings.vue.typesOptionsMod.DefaultData
  import typings.vue.typesOptionsMod.DefaultMethods
  import typings.vue.typesOptionsMod.DefaultProps
  import typings.vue.typesOptionsMod.PropsDefinition
  import typings.vue.typesVueMod.Vue

  type Addon = StringDictionary[js.Function2[/* storyName */ String, /* storyFn */ StoryFunction, Unit]]
  type DecoratorParameters = StringDictionary[js.Any]
  type StoryDecorator = js.Function2[
    /* story */ js.Function0[
      ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps], 
        DefaultProps
      ]
    ], 
    /* context */ Anon_Kind, 
    (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]) | Null
  ]
  type StoryFunction = js.Function0[
    (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]) | String
  ]
}
