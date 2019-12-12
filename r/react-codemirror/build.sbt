organization := "org.scalablytyped"
name := "react-codemirror"
version := "v1.0.0-dt-20191126Z-639616"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20191126Z-c782f9",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-069b07",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20191126Z-617975")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        