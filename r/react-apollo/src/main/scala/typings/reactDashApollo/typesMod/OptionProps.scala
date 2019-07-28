package typings.reactDashApollo.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-apollo.react-apollo/types.DataProps<TData, TGraphQLVariables> ]:? react-apollo.react-apollo/types.DataProps<TData, TGraphQLVariables>[P]}
- Dropped {[ P in keyof react-apollo.react-apollo/types.MutateProps<TData, TGraphQLVariables> ]:? react-apollo.react-apollo/types.MutateProps<TData, TGraphQLVariables>[P]} */ trait OptionProps[TProps, TData, TGraphQLVariables] extends js.Object {
  var ownProps: TProps
}

object OptionProps {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables](ownProps: TProps): OptionProps[TProps, TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(ownProps = ownProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionProps[TProps, TData, TGraphQLVariables]]
  }
}

