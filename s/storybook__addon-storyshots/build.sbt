organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.7-34d71a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-f936ad",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-5e9c54",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-5339c6",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-5dcb4b",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-265421",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-7280a3",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-a56594",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-c8c047",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-42b39e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6320e5",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200114Z-d16766",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-9633df",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7b0fe5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ce939a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-c8cde6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-81a9cd",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-a24188",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.7-a98803",
  "org.scalablytyped" %%% "storybook__api" % "5.3.7-736043",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.7-784868",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.7-3808a0",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.7-af00ac",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-b35991",
  "org.scalablytyped" %%% "typescript" % "3.7.5-6c2ac7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        