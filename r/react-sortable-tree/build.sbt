organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190918Z-749a0b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "dnd-core" % "9.4.0-2f03d2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-d5d73d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "react-dnd" % "9.4.0-a80022",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190722Z-baaab8",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        