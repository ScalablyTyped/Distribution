package typings
package atStorybookHtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookHtmlMod {
  type DecoratorParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RenderFunction = js.Function0[java.lang.String | js.Array[java.lang.String]]
  type StoryDecorator = js.Function2[
    /* story */ RenderFunction, 
    /* context */ atStorybookHtmlLib.Anon_Kind, 
    java.lang.String | scala.Null
  ]
}
