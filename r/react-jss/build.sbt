organization := "org.scalablytyped"
name := "react-jss"
version := "8.6-dt-20190722Z-be2ec0"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-d9ffbc",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-b13eba",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "theming" % "1.3-dt-20190930Z-c19767")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        