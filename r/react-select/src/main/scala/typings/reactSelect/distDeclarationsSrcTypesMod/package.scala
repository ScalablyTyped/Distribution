package typings.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSelect.reactSelectStrings.clearIndicator
import typings.reactSelect.reactSelectStrings.container
import typings.reactSelect.reactSelectStrings.control
import typings.reactSelect.reactSelectStrings.dropdownIndicator
import typings.reactSelect.reactSelectStrings.group
import typings.reactSelect.reactSelectStrings.groupHeading
import typings.reactSelect.reactSelectStrings.indicatorSeparator
import typings.reactSelect.reactSelectStrings.indicatorsContainer
import typings.reactSelect.reactSelectStrings.input
import typings.reactSelect.reactSelectStrings.loadingIndicator
import typings.reactSelect.reactSelectStrings.loadingMessage
import typings.reactSelect.reactSelectStrings.menu
import typings.reactSelect.reactSelectStrings.menuList
import typings.reactSelect.reactSelectStrings.menuPortal
import typings.reactSelect.reactSelectStrings.multiValue
import typings.reactSelect.reactSelectStrings.multiValueLabel
import typings.reactSelect.reactSelectStrings.multiValueRemove
import typings.reactSelect.reactSelectStrings.noOptionsMessage
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.reactSelectStrings.placeholder
import typings.reactSelect.reactSelectStrings.singleValue
import typings.reactSelect.reactSelectStrings.valueContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CX = js.Function2[/* state */ ClassNamesState, /* className */ js.UndefOr[String], String]

type ClassNamesState = StringDictionary[Boolean]

type GetOptionLabel[Option] = js.Function1[/* option */ Option, String]

type GetOptionValue[Option] = js.Function1[/* option */ Option, String]

type GetStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = js.Function2[
/* keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> */ /* propertyName */ clearIndicator | container | control | dropdownIndicator | group | groupHeading | indicatorsContainer | indicatorSeparator | input | loadingIndicator | loadingMessage | menu | menuList | menuPortal | multiValue | multiValueLabel | multiValueRemove | noOptionsMessage | option | placeholder | singleValue | valueContainer, 
/* import warning: importer.ImportType#apply Failed type conversion: react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>] */ /* props */ js.Any, 
CSSObjectWithLabel]

type MultiValue[Option] = js.Array[Option]

type Options[Option] = js.Array[Option]

type OptionsOrGroups[Option, Group /* <: GroupBase[Option] */] = js.Array[Option | Group]

type PropsValue[Option] = MultiValue[Option] | SingleValue[Option]

type SingleValue[Option] = Option | Null
