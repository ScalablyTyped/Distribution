package typings.reactDashMedia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMediaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.reactDashMedia.Anon_Children
  import typings.reactDashMedia.Anon_ChildrenDefaultMatches

  /**
    * The type of the `queries` prop
    */
  type MediaQueries = StringDictionary[MediaQueryValue]
  type MediaQueryObject = StringDictionary[Boolean | Double | String]
  /**
    * All allowed forms of media query inputs
    */
  type MediaQueryValue = String | MediaQueryObject | js.Array[MediaQueryObject]
  type MultiQueryProps[Queries] = BaseProps with Anon_Children[Queries]
  /**
    * The type of returned `matches` in case the `queries` prop is provided. The keys on `matches`
    * are inferred from the shape of `queries`.
    *
    * @example
    *
    * <Media queries={{ small: '...', medium: '...' }}>{
    *   // matches: { small: boolean, medium: boolean }
    *   matches => {}
    * }</Media>
    */
  type QueryResults[Queries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof Queries ]: boolean}
    */ typings.reactDashMedia.reactDashMediaStrings.QueryResults with js.Any
  type SingleQueryProps = BaseProps with Anon_ChildrenDefaultMatches
}
