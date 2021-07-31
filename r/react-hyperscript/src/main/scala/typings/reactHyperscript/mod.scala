package typings.reactHyperscript

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(componentOrTag: String): ReactElement = ^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: String, children: js.Array[Element]): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: String, children: Element): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: ComponentClass[js.Object, ComponentState]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: ComponentClass[js.Object, ComponentState], children: js.Array[Element]): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: ComponentClass[js.Object, ComponentState], children: Element): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: StatelessComponent[js.Object]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: StatelessComponent[js.Object], children: js.Array[Element]): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply(componentOrTag: StatelessComponent[js.Object], children: Element): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P, children: js.Array[Element]): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P, children: Element): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, ComponentState], properties: P, children: js.Array[Element]): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, ComponentState], properties: P, children: Element): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P, children: js.Array[Element]): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P, children: Element): ReactElement = (^.asInstanceOf[js.Dynamic].apply(componentOrTag.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @JSImport("react-hyperscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Element = ReactElement | String | Double | Null
}
