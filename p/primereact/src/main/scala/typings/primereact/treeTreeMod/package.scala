package typings.primereact.treeTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type TreeCheckboxSelectionKeys = StringDictionary[TreeCheckboxSelectionKeyType]

type TreeExpandedKeysType = StringDictionary[Boolean]

type TreeFilterTemplateType = ReactNode | (js.Function1[/* options */ TreeFilterOptions, ReactNode])

type TreeFooterTemplateType = ReactNode | (js.Function1[/* props */ TreeProps, ReactNode])

type TreeHeaderTemplateType = ReactNode | (js.Function1[/* options */ TreeHeaderTemplateOptions, ReactNode])

type TreeMultipleSelectionKeys = StringDictionary[Boolean]

type TreeNodeDoubleClickParams = TreeNodeClickParams

type TreeNodeTemplateType = ReactNode | (js.Function2[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
/* options */ TreeNodeTemplateOptions, 
ReactNode])

type TreeSelectionKeyType = Boolean | TreeCheckboxSelectionKeyType

type TreeSelectionKeys = String | TreeMultipleSelectionKeys | TreeCheckboxSelectionKeys | Null

type TreeTogglerTemplateType = ReactNode | (js.Function2[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
/* options */ TreeTogglerTemplateOptions, 
ReactNode])
