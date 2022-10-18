package typings.reactSelect.anon

import org.scalablytyped.runtime.Instantiable1
import typings.reactSelect.distDeclarationsSrcSelectMod.Props
import typings.reactSelect.distDeclarationsSrcSelectMod.Select
import typings.reactSelect.distDeclarationsSrcSelectMod.State
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSelect
  extends StObject
     with Instantiable1[
      /* props */ Props[
        /* import warning: RewrittenClass.unapply cls was tparam Option */ Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IsMulti */ Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Group */ Any
      ], 
      Select[
        js.Object, 
        Boolean, 
        GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any]
      ]
    ] {
  
  var defaultProps: Arialive = js.native
  
  def getDerivedStateFromProps(props: Props[Any, Boolean, GroupBase[Any]], state: State[Any, Boolean, GroupBase[Any]]): AriaSelection | InputIsHidden = js.native
}
