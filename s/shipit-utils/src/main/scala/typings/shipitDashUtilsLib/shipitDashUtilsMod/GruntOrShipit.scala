package typings
package shipitDashUtilsLib.shipitDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GruntOrShipit extends js.Object {
  val blTask: js.UndefOr[
    (js.Function2[
      /* name */ java.lang.String, 
      (/* depsOrFn */ js.Array[java.lang.String]) | (/* depsOrFn */ shipitDashCliLib.shipitDashCliMod.EmptyCallback), 
      _
    ]) | (js.Function3[
      /* name */ java.lang.String, 
      (/* depsOrFn */ js.Array[java.lang.String]) | (/* depsOrFn */ shipitDashCliLib.shipitDashCliMod.EmptyCallback), 
      /* fn */ js.Function0[scala.Unit], 
      _
    ])
  ] = js.native
  val config: js.UndefOr[js.Object] = js.native
  val domain: js.UndefOr[js.Any] = js.native
  val doneCallback: js.UndefOr[js.Any] = js.native
  val emit: js.UndefOr[js.Function1[/* name */ java.lang.String, _]] = js.native
  val environment: js.UndefOr[java.lang.String] = js.native
  val initConfig: js.UndefOr[js.Function1[/* config */ js.Object, shipitDashCliLib.Typeofshipit]] = js.native
  val isRunning: js.UndefOr[scala.Boolean] = js.native
  val local: js.UndefOr[
    (js.Function1[
      /* command */ java.lang.String, 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ]) | (js.Function2[
      /* command */ java.lang.String, 
      /* options */ nodeLib.childUnderscoreProcessMod.ExecOptions, 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ]) | (js.Function3[
      /* command */ java.lang.String, 
      /* options */ nodeLib.childUnderscoreProcessMod.ExecOptions, 
      /* callback */ js.Function3[
        /* error */ stdLib.Error, 
        /* stdout */ java.lang.String, 
        /* stderr */ java.lang.String, 
        scala.Unit
      ], 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ])
  ] = js.native
  val log: js.UndefOr[js.Function1[/* log */ js.Any, scala.Unit]] = js.native
  val on: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* callback */ js.Function1[/* e */ js.Any, scala.Unit], 
      _
    ]
  ] = js.native
  val remote: js.UndefOr[
    (js.Function1[
      /* command */ java.lang.String, 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ]) | (js.Function2[
      /* command */ java.lang.String, 
      /* options */ nodeLib.childUnderscoreProcessMod.ExecOptions, 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ]) | (js.Function3[
      /* command */ java.lang.String, 
      /* options */ nodeLib.childUnderscoreProcessMod.ExecOptions, 
      /* callback */ js.Function3[
        /* error */ stdLib.Error, 
        /* stdout */ java.lang.String, 
        /* stderr */ java.lang.String, 
        scala.Unit
      ], 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ])
  ] = js.native
  val remoteCopy: js.UndefOr[
    (js.Function2[
      /* src */ java.lang.String, 
      /* dest */ java.lang.String, 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ]) | (js.Function3[
      /* src */ java.lang.String, 
      /* dest */ java.lang.String, 
      /* options */ nodeLib.childUnderscoreProcessMod.ExecOptions, 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ]) | (js.Function4[
      /* src */ java.lang.String, 
      /* dest */ java.lang.String, 
      /* options */ nodeLib.childUnderscoreProcessMod.ExecOptions, 
      /* callback */ js.Function3[
        /* error */ stdLib.Error, 
        /* stdout */ java.lang.String, 
        /* stderr */ java.lang.String, 
        scala.Unit
      ], 
      js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal]
    ])
  ] = js.native
  val seq: js.UndefOr[js.Array[_]] = js.native
  val start: js.UndefOr[
    js.Function1[
      (/* tasks */ js.Array[java.lang.String]) | (/* tasks */ java.lang.String), 
      shipitDashCliLib.Typeofshipit
    ]
  ] = js.native
  val task: js.UndefOr[
    (js.Function2[
      /* name */ java.lang.String, 
      (/* depsOrFn */ js.Array[java.lang.String]) | (/* depsOrFn */ shipitDashCliLib.shipitDashCliMod.EmptyCallback), 
      shipitDashCliLib.Typeofshipit
    ]) | (js.Function3[
      /* name */ java.lang.String, 
      (/* depsOrFn */ js.Array[java.lang.String]) | (/* depsOrFn */ shipitDashCliLib.shipitDashCliMod.EmptyCallback), 
      /* fn */ js.Function0[scala.Unit], 
      shipitDashCliLib.Typeofshipit
    ])
  ] = js.native
  val tasks: js.UndefOr[shipitDashCliLib.shipitDashCliMod.Tasks] = js.native
}

